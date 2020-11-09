package com.flinstones.musicauth.repository;

import com.flinstones.musicauth.model.GoogleAuthCredentials;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoogleCredentialsRepository extends CassandraRepository<GoogleAuthCredentials, String> {
}
