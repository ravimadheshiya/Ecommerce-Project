package com.FashNova.service;

import com.FashNova.exception.SellerException;
import com.FashNova.exception.UserException;
import com.FashNova.request.LoginRequest;
import com.FashNova.request.SignupRequest;
import com.FashNova.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
