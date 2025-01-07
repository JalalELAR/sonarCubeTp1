package flight.config;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import flight.dto.UserDto;
import flight.models.UserDao;
import flight.repository.UserRepository;

@Service
public class TheUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDao user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
	}

	public UserDao loadUserByEmail(String email) {
		UserDao user = userRepository.findByEmail(email);
		return user;
	}
	
	public UserDao loadUserByName(String username) {
		UserDao user = userRepository.findByUsername(username);
		return user;
	}
	
	public void updateUser(UserDao user) {
		userRepository.save(user);
	}
	
	public UserDetails loadUserByResetToken(String resetToken) throws UsernameNotFoundException {
		UserDao user = userRepository.findByResetToken(resetToken);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with resetToken: " + resetToken);
		}
		return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
	}
	
	public UserDao save(UserDto user) {
		UserDao newUser = new UserDao();
		newUser.setUsername(user.getUsername());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setConfpassword(bcryptEncoder.encode(user.getConfpassword()));
		newUser.setResetToken(UUID.randomUUID().toString());
		return userRepository.save(newUser);
	}

}
