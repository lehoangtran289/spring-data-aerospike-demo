package com.example.demo.persistence.optimisticlocking;

import lombok.Value;
import lombok.experimental.NonFinal;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.aerospike.mapping.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.util.List;

@Value
@Document
public class VersionedDocument {

    @Id
    String key;

    @Field("avlOpts")
    List<Integer> availableOptions;

    @NonFinal
    @Version
    Long version;
}
