package com.flinstones.musicauth.repository;

import com.flinstones.musicauth.model.GoogleAuthCredentials;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.stereotype.Repository;
import org.springframework.data.cassandra.repository.CassandraRepository;

@Repository
public interface GoogleAuthRepository extends CassandraRepository<GoogleAuthCredentials, String> {

}

