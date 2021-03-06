package se.radley.demo.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
interface UserRepository extends MongoRepository<User, String> {

}
