package uz.pdp.task_2_2_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_2.entity.Character;
import uz.pdp.task_2_2_2.entity.Property;

@Projection(types = Property.class)
public interface PropertyCustom {
    Integer getId();
    String getValue();
    Character getCharacter();
}