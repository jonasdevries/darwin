package be.jslm.darwin.web.controllers;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
public class Member {

    private String firstName;
    private String lastName;

}
