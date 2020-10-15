package br.com.spring.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.spring.domain.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unused")
@Entity(name = "user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 75, nullable = false)
	private String name;
	@Column(length = 75, nullable = false, unique = true)
	private String email;
	@Column(length = 100, nullable = false)
	private String password;
	@OneToMany(mappedBy = "owner")
	private List<Request> requests = new ArrayList<>();
	@OneToMany(mappedBy = "owner")
	private List<RequestStage> stages = new ArrayList<>();
	@Column(length = 20, nullable = false)
	@Enumerated(EnumType.STRING)
	private Role role;
}
