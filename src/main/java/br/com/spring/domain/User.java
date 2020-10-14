package br.com.spring.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unused")
public class User {
	private Long id;
	private String name;
	private String email;
	private String password;
	private List<Request> requests = new ArrayList<>();
	private List<RequestStage> stages = new ArrayList<>();
}
