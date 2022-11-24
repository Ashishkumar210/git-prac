package com.Ashsih.blog.blogappapis.service.iml;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ashsih.blog.blogappapis.entity.Comment;
import com.Ashsih.blog.blogappapis.entity.Post;
import com.Ashsih.blog.blogappapis.exception.ResourceNotFoundException;
import com.Ashsih.blog.blogappapis.payloads.CommentDto;
import com.Ashsih.blog.blogappapis.repository.CommentRepo;
import com.Ashsih.blog.blogappapis.repository.PostRepo;
import com.Ashsih.blog.blogappapis.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private PostRepo postRepo;

	@Autowired
	private CommentRepo commentRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "postId", postId));

		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		comment.setPost(post);
		Comment saveComment = this.commentRepo.save(comment);
		return this.modelMapper.map(saveComment, CommentDto.class);

	}

	@Override
	public void deleteComment(Integer commentId) {

		Comment com = this.commentRepo.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", " CommentId", commentId));

		this.commentRepo.delete(com);

	}

}
