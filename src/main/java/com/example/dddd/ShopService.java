package com.example.dddd;

import com.example.dddd.entity.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class ShopService {

    public void shopCheck() throws JsonProcessingException {


        String kaspiJson = "{\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"type\": \"orders\",\n" +
                "            \"id\": \"AAasdwjAxNDg1\",\n" +
                "            \"attributes\": {\n" +
                "                \"code\": \"154201485\",\n" +
                "                \"totalPrice\": 4090,\n" +
                "                \"paymentMode\": \"PREPAID\",\n" +
                "                \"plannedDeliveryDate\": 1614571200000,\n" +
                "                \"creationDate\": 1614529720489,\n" +
                "                \"isKaspiDelivery\": false,\n" +
                "                \"deliveryMode\": \"DELIVERY_LOCAL\",\n" +
                "                \"deliveryAddress\": {\n" +
                "                    \"streetName\": \"12-й микрорайон\",\n" +
                "                    \"streetNumber\": \"4\",\n" +
                "                    \"town\": \"Алматы\",\n" +
                "                    \"district\": null,\n" +
                "                    \"building\": null,\n" +
                "                    \"formattedAddress\": \"Алматы,  кв. 122\",\n" +
                "                    \"latitude\": 43.2215803,\n" +
                "                    \"longitude\": 76.8705957\n" +
                "                },\n" +
                "                \"signatureRequired\": false,\n" +
                "                \"preOrder\": false,\n" +
                "                \"state\": \"NEW\",\n" +
                "                \"approvedByBankDate\": 1614529720944,\n" +
                "                \"status\": \"APPROVED_BY_BANK\",\n" +
                "                \"customer\": {\n" +
                "                    \"id\": \"DssA12344VF3Nd==\",\n" +
                "                    \"name\": \"DDDDD\",\n" +
                "                    \"cellPhone\": \"7022221121\",\n" +
                "                    \"firstName\": \"DDDDD\",\n" +
                "                    \"lastName\": \"Di\"\n" +
                "                },\n" +
                "                \"deliveryCost\": 0\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"user\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"https://bbb/shop/api/v2/orders/AAasdwjAxNDg1/relationships/user\",\n" +
                "                        \"related\": \"https://bbb/shop/api/v2/orders/AAasdwjAxNDg1/user\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"customers\",\n" +
                "                        \"id\": \"DssA12344VF3Nd==\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"entries\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"https://bbb/shop/api/v2/orders/AAasdwjAxNDg1/relationships/entries\",\n" +
                "                        \"related\": \"https://bbb/shop/api/v2/orders/AAasdwjAxNDg1/entries\"\n" +
                "                    },\n" +
                "                    \"data\": [\n" +
                "                        {\n" +
                "                            \"type\": \"orderentries\",\n" +
                "                            \"id\": \"AAasdwjAxNDg1IyMw\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"https://bbb/shop/api/v2/orders/AAasdwjAxNDg1\"\n" +
                "            }\n" +
                "        }\n" +
                "    ],\n" +
                "    \"included\": [\n" +
                "        {\n" +
                "            \"type\": \"orderentries\",\n" +
                "            \"id\": \"AAasdwjAxNDg1IyMw\",\n" +
                "            \"attributes\": {\n" +
                "                \"quantity\": 10,\n" +
                "                \"totalPrice\": 4090,\n" +
                "                \"entryNumber\": 0,\n" +
                "                \"deliveryCost\": 0,\n" +
                "                \"basePrice\": 409\n" +
                "            },\n" +
                "            \"relationships\": {\n" +
                "                \"deliveryPointOfService\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"https://bbb/shop/api/v2/orderentries/AAasdwjAxNDg1IyMw/relationships/deliveryPointOfService\",\n" +
                "                        \"related\": \"https://bbb/shop/api/v2/orderentries/AAasdwjAxNDg1IyMw/deliveryPointOfService\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"pointofservices\",\n" +
                "                        \"id\": \"TWFnbnVtXzE3MTg=\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"product\": {\n" +
                "                    \"links\": {\n" +
                "                        \"self\": \"https://bbb/shop/api/v2/orderentries/AAasdwjAxNDg1IyMw/relationships/product\",\n" +
                "                        \"related\": \"https://bbb/shop/api/v2/orderentries/AAasdwjAxNDg1IyMw/product\"\n" +
                "                    },\n" +
                "                    \"data\": {\n" +
                "                        \"type\": \"masterproducts\",\n" +
                "                        \"id\": \"MTAwMjIzMDg5\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"links\": {\n" +
                "                \"self\": \"https://bbb/shop/api/v2/orderentries/AAasdwjAxNDg1IyMw\"\n" +
                "            }\n" +
                "        }\n" +
                "    ],\n" +
                "    \"meta\": {\n" +
                "        \"pageCount\": 1,\n" +
                "        \"totalCount\": 1\n" +
                "    }\n" +
                "}";
        ObjectMapper objectMapper = new ObjectMapper();
        Root rootDto = objectMapper.readValue(kaspiJson, Root.class);
        System.out.println(rootDto.data.get(0).attributes.approvedByBankDate);

    }
}
