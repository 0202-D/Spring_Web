package com.mitra.blog.repo;

import com.mitra.blog.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
