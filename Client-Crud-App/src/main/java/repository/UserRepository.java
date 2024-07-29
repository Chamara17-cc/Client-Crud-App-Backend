package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clientapp.Client_Crud_App.models.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}