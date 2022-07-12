//package afzal.online.exam.app.services.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import afzal.online.exam.app.models.User;
//import afzal.online.exam.app.repository.UserRepository;
//
//@Service
//public class UserDetailServiceImpl implements UserDetailsService{
//
//	@Autowired
//	 private UserRepository userRepository;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//	
//		 User findUser = this.userRepository.findByUsername(username);
//		
//		if(findUser == null) {
//			throw new UsernameNotFoundException("No User Foud !!");
//		}
//		
//		return findUser;
//	}
//
//}
