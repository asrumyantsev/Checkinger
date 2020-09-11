package pro.sofix.checkinger.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity

public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String email;
    private String chatid;
    private String phone;
    private String comment;
}
