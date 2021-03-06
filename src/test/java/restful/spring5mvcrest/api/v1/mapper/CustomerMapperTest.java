package restful.spring5mvcrest.api.v1.mapper;

import org.junit.jupiter.api.Test;
import restful.spring5mvcrest.api.v1.model.CustomerDTO;
import restful.spring5mvcrest.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerMapperTest {
    public static final String FIRSTNAME = "Jimmy";
    public static final String LASTNAME = "Fallon";
    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void customerToCustomerDTO() throws Exception {
        //given
        Customer customer = new Customer();
        customer.setFirstName(FIRSTNAME);
        customer.setLastName(LASTNAME);

        //when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        //then
        assertEquals(FIRSTNAME, customerDTO.getFirstName());
        assertEquals(LASTNAME, customerDTO.getLastName());

    }
}