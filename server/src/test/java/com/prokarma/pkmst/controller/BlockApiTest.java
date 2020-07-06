/*
 * Rosetta
 * Build Once. Integrate Your Blockchain Everywhere.
 *
 * The version of the OpenAPI document: 1.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.BlockRequest;
import com.prokarma.pkmst.model.BlockResponse;
import com.prokarma.pkmst.model.BlockTransactionRequest;
import com.prokarma.pkmst.model.BlockTransactionResponse;
import com.prokarma.pkmst.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for BlockApi
 */
@Ignore
public class BlockApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final BlockApi api = new BlockApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Get a Block
     *
     * Get a block by its Block Identifier. If transactions are returned in the same call to the node as fetching the block, the response should include these transactions in the Block object. If not, an array of Transaction Identifiers should be returned so /block/transaction fetches can be done to get all transaction information.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void blockTest() throws Exception {
        BlockRequest blockRequest = null;
    ResponseEntity<BlockResponse> response = api.block(blockRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Get a Block Transaction
     *
     * Get a transaction in a block by its Transaction Identifier. This endpoint should only be used when querying a node for a block does not return all transactions contained within it. All transactions returned by this endpoint must be appended to any transactions returned by the /block method by consumers of this data. Fetching a transaction by hash is considered an Explorer Method (which is classified under the Future Work section). Calling this endpoint requires reference to a BlockIdentifier because transaction parsing can change depending on which block contains the transaction. For example, in Bitcoin it is necessary to know which block contains a transaction to determine the destination of fee payments. Without specifying a block identifier, the node would have to infer which block to use (which could change during a re-org). Implementations that require fetching previous transactions to populate the response (ex: Previous UTXOs in Bitcoin) may find it useful to run a cache within the Rosetta server in the /data directory (on a path that does not conflict with the node).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void blockTransactionTest() throws Exception {
        BlockTransactionRequest blockTransactionRequest = null;
    ResponseEntity<BlockTransactionResponse> response = api.blockTransaction(blockTransactionRequest , accept);

        // TODO: test validations
    }
    
}