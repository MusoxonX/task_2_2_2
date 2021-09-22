package uz.pdp.task_2_2_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_2_2_2.entity.Character;
import uz.pdp.task_2_2_2.entity.Product;
import uz.pdp.task_2_2_2.projection.CharacterCustom;
import uz.pdp.task_2_2_2.projection.ProductCustom;

@RepositoryRestResource(path = "character",excerptProjection = CharacterCustom.class)
public interface CharacterRepository extends JpaRepository<Character,Integer> {
}
