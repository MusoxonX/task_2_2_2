package uz.pdp.task_2_2_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_2_2_2.entity.Category;
import uz.pdp.task_2_2_2.entity.Device;
import uz.pdp.task_2_2_2.projection.CategoryCustom;
import uz.pdp.task_2_2_2.projection.DeviceCustom;

@RepositoryRestResource(path = "category",excerptProjection = CategoryCustom.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
