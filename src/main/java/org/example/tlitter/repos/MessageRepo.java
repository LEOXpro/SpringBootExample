package org.example.tlitter.repos;

import org.example.tlitter.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findByTagContaining(String tag);
}
