package ucu.edu.ua.lab8.flower.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucu.edu.ua.lab8.flower.model.AppUser;
import ucu.edu.ua.lab8.flower.repository.AppUserRepository;

@Service
public class AppUserService {

    private final AppUserRepository appuserRepository;

    @Autowired
    public AppUserService(AppUserRepository appuserRepository) {
        this.appuserRepository = appuserRepository;
    }

    public List<AppUser> getAppUsers() {
        return appuserRepository.findAll();
    }

    public AppUser createAppUser(AppUser appuser) {
        return appuserRepository.save(appuser);
    }

    public AppUser getUserByEmail(String email) {
        return appuserRepository.findUserByEmail(email);
    }
}
