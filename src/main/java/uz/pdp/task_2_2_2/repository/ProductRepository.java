package uz.pdp.task_2_2_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_2_2_2.entity.Attachment;
import uz.pdp.task_2_2_2.entity.Product;
import uz.pdp.task_2_2_2.projection.ProductCustom;

@RepositoryRestResource(path = "product",excerptProjection = ProductCustom.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}