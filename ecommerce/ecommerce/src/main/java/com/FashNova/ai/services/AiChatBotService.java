package com.FashNova.ai.services;

import com.FashNova.exception.ProductException;
import com.FashNova.response.ApiResponse;
import org.json.JSONException;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException, JSONException;
}
