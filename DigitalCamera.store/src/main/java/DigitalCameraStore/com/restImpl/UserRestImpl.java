package DigitalCameraStore.com.restImpl;

import DigitalCameraStore.com.rest.UserRest;
import DigitalCameraStore.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> signUP(Map<String, String> requestMap) {
        try{
            return userService.signUp(requestMap);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return new ResponseEntity<String>("{\"message\":\"Something went Wrong\"}", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
