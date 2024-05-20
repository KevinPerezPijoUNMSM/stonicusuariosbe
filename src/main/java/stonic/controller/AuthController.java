package stonic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import stonic.model.AuthResponse;
import stonic.model.LoginRequest;
import stonic.model.RegisterRequest;
import stonic.service.AuthService;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor

public class AuthController {
	
	private final AuthService authService;
	
	@PostMapping(value="/auth")
	public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
		return ResponseEntity.ok(/*new AuthResponse()*/  authService.login(request));
		//return "Login from public endpoint";
		
	}

	@PostMapping(value="/register")
	public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
		return ResponseEntity.ok(authService.register(request));
		//return "Register from public endpoint";
		
	}
	/*
	@PostMapping(value="/register")
	public String register(@RequestBody RegisterRequest request) {
		return "Register from public endpoint";
	}
	*/

}
