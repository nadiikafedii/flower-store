package ucu.edu.ua.lab8.flower.controller;

import java.net.ResponseCache;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.ua.lab8.flower.model.AppUser;
import ucu.edu.ua.lab8.flower.service.AppUserService;

@RestController
@RequestMapping("/api/v1")
public class AppUserController {
    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/user")
    public List<AppUser> getAppUsers() {
        return appUserService.getAppUsers();
    }

    @PostMapping("/user")
    public AppUser createAppUser(@RequestBody AppUser appuser) {
        return appUserService.createAppUser(appuser);
    }

    @GetMapping("/user/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email){
        AppUser userByEmail = appUserService.getUserByEmail(email);

        if (userByEmail != null){
            return ResponseEntity.ok(userByEmail);

        }
        return ResponseEntity.notFound().build();
    }
}
