package com.FashNova.ai.controllers;

import com.FashNova.ai.services.AiChatBotService;
import com.FashNova.model.User;
import com.FashNova.request.Prompt;
import com.FashNova.response.ApiResponse;
import com.FashNova.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ai/chat")
public class AiChatBotController {

    private final AiChatBotService aiChatBotService;
    private final UserService userService;

    @PostMapping()
    public ResponseEntity<ApiResponse> generate(
            @RequestBody Prompt prompt,
            @RequestParam(required = false) Long userId,
            @RequestParam(required = false) Long productId,
            @RequestHeader(required = false,name = "Authorization")String jwt) throws Exception {

        String message = prompt.getPrompt();
        if (productId != null) {
            message = "the product id is " + productId +", " + message ;
        }

        User user=new User();
        if(jwt!=null)
            user=userService.findUserProfileByJwt(jwt);

//        Long userId;
//        if(user!=null){
//            userId=user.getId();
//        }

        ApiResponse apiResponse = aiChatBotService.aiChatBot(message,productId,user.getId());

        return ResponseEntity.ok(apiResponse);

    }

}
