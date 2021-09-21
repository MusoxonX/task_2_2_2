package uz.pdp.task_2_2_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_2_2_2.entity.Attachment;
import uz.pdp.task_2_2_2.entity.Group;
import uz.pdp.task_2_2_2.entity.Product;

@Projection(types = Product.class)
public interface ProductCustom {
    Integer getId();
    String getName();
    String getText();
    double getPrice();
    Group getGroup();
    Attachment getAttachment();
}