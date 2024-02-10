package com.rocketseat.certification_nlw.modules.students.dto;

import com.rocketseat.certification_nlw.modules.questions.dto.QuestionAnswerDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class StudentCertificationAnswerDTO {


    private String email;
    private String technology;
    private List<QuestionAnswerDTO> questionsAnswers;
}
