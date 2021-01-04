package com.flinstones.musicauth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Data
@Table("google_auth_credentials")
@AllArgsConstructor
@NoArgsConstructor
public class GoogleAuthCredentials {

    @PrimaryKey
    private String userEmailId;

    @NotNull
    @Column("user_name")
    private String userName;

    @NotNull
    @Column("user_role")
    private String userRole;

}