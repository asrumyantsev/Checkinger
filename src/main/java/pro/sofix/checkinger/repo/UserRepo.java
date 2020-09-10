package pro.sofix.checkinger.repo;

import org.springframework.data.repository.CrudRepository;
import pro.sofix.checkinger.models.User;

public interface UserRepo extends CrudRepository<User, Integer> {


}
