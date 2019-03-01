package org.payment.debitsc.repository;

import org.payment.debitsc.Profiles;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.map.repository.config.EnableMapRepositories;

@Configuration
@Profile(Profiles.MEMORY)
@EnableMapRepositories
public class RepoConfigInMemory {
}
