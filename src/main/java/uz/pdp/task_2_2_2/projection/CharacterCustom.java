package uz.pdp.task_2_2_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_2.entity.Character;
import uz.pdp.task_2_2_2.entity.Product;

@Projection(types = Character.class)
public interface CharacterCustom {
    Integer getId();
    String getName();
    Product getProduct();
}
