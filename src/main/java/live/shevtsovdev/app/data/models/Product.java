package live.shevtsovdev.app.data.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Product {

    @Id
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "created_by")
    private Long creatorId;

    @Column(name = "attached_to")
    private Long employeeId;

    @Column(name = "created_at")
    private Long createdAt;

    @Column(name = "updated_at")
    private Long updatedAt;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "document_id")
    private Long documentId;
}
