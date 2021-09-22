package uz.pdp.task_2_2_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_2_2_2.entity.Character;
import uz.pdp.task_2_2_2.entity.Property;
import uz.pdp.task_2_2_2.projection.CharacterCustom;
import uz.pdp.task_2_2_2.projection.PropertyCustom;

@RepositoryRestResource(path = "property",excerptProjection = PropertyCustom.class)
public interface PropertyRepository extends JpaRepository<Property,Integer> {
}
