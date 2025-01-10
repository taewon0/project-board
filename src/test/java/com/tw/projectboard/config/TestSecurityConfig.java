package com.tw.projectboard.config;

import com.tw.projectboard.domain.UserAccount;
import com.tw.projectboard.repository.UserAccountRepository;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@Import(SecurityConfig.class)
public class TestSecurityConfig {

    @MockitoBean
    private UserAccountRepository userAccountRepository;

    @BeforeTestMethod
    public void securitySetUp(){
        given(userAccountRepository.findById(anyString())).willReturn(Optional.of(UserAccount.of(
            "t1Test",
            "pw",
            "t1test@mail.com",
            "t1-test",
                "test memo"
        )));

    }
}
