package com.jeffborda.parkwestmi.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    public ApplicationUser findUserByUsername(String username);
    public ApplicationUser findUserById(long id);
}
