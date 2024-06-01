package com.company.MyFarm.registration;

import com.company.MyFarm.appuser.AppUser;
import com.company.MyFarm.appuser.AppUserRole;
import com.company.MyFarm.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;


    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.
                test(request.getEmail());

        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }
        String token = appUserService.signUpUser(
                new AppUser(
                        request.getEmail(),
                        request.getPNumber1(),
                        request.getPNumber2(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );

        return token;
    }
}
