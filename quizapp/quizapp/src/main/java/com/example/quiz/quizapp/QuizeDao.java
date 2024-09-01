package com.example.quiz.quizapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizeDao extends JpaRepository<Quiz, Integer> {

}
