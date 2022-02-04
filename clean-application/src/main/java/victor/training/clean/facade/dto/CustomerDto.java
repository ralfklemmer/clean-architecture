package victor.training.clean.facade.dto;

import lombok.Data;
import victor.training.clean.entity.Customer;

import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;

@Data
public class CustomerDto { // sent to FE
   public Long id;
   @Size(min = 5)
   public String name;
   // @Email
//   @Exist // NEVER GO TO DB FROM ANNOT
   public String email;
   public Long siteId;
   public String creationDateStr;

   public CustomerDto() {
   }

   public CustomerDto(Customer customer) {
      name = customer.getName();
      email = customer.getEmail();
      creationDateStr = new SimpleDateFormat("yyyy-MM-dd").format(customer.getCreationDate());
      id = customer.getId();
   }
}
