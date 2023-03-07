package com.study.openai.domain.chat.presentation;

import com.study.openai.domain.chat.presentation.dto.request.QuestionRequestDto;
import com.study.openai.domain.chat.presentation.dto.response.ChatGptResponseDto;
import com.study.openai.domain.chat.service.ChatGptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatGPTController {
    private final ChatGptService chatGptService;

    @PostMapping
    private ChatGptResponseDto getChatGpt(@RequestBody QuestionRequestDto requestDto){
        return chatGptService.askQuestion(requestDto);
    }
}
