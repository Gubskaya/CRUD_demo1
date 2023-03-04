package crud.demo1.service;

import crud.demo1.entity.User;
import crud.demo1.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User findById(Long id) {
        return userRepo.getReferenceById(id);
    }

    public List<User> findAll(){
        return userRepo.findAll();
    }

    public User saveNewUser(User user) {
        return userRepo.save(user);
    }

    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }

}
