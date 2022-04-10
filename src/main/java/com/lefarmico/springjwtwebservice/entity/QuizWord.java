package com.lefarmico.springjwtwebservice.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "quiz_word")
public class QuizWord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "is_answered")
    private Boolean isAnswered;

    @Column(name = "original_word")
    private String originalWord;

    @Column(name = "correct_translation")
    private String correctTranslation;

    @Column(name = "quiz_id")
    private Long quizId;

    @ElementCollection
    private List<String> wrongTranslations;
}