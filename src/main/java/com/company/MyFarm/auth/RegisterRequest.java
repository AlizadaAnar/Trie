package com.company.MyFarm.auth;

import com.company.MyFarm.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

  private String firstname;
  private String number1;
  private String number2;
  private String email;
  private String password;
  private Role role;
}
