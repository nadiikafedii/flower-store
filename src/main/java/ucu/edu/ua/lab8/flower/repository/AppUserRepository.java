package ucu.edu.ua.lab8.flower.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ucu.edu.ua.lab8.flower.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    @Query("SELECT u FROM app_user u WHERE u.email = ?1")
        AppUser findUserByEmail(String email);

}
