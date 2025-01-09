package com.gallegos.licenses.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
    private String id;
    private String name;
    private String contactName;
    private String contactEmail;
    private String contactPhone;
}
