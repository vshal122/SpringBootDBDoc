package com.rakuten.StudentApp.Model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="FRCT_DETAIL")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FRCTDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition="INT",name="ID")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "REQUEST_PENDING_SERVICE_OR_REPAIR", length = 20)
    private RequestPendingServiceOrRepair requestPendingServiceOrRepair;


    public enum RequestPendingServiceOrRepair{
        YES,NO
    }

    @Column(name = "SMART_CHART1", length = 200)
    private  String smartChat1;

    @Column(name = "WIRE_CENTER", length = 200)
    private String wireCenter;

    @Column(name = "ENGINEER_NAME", length = 200)
    private String engineerName;

    @Column(name = "ENGINEER_CONTACT", length = 50)
    private String engineerContact;

    @Enumerated(EnumType.STRING)
    @Column(name = "REQUEST_TYPE", length = 50)
    private RequestType requestType;
    public enum RequestType {
        REMOVE_PAIR_FROM_LOAD_COIL,MISSING_INNERDUCT,HAND_HOLE,COPPER_CONSOLIDATION,BINDING_POST,VRAD_SAI_ISSUE;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "LOAD_REMOVE_ASSIGNED_PAIR",length = 20)
    private LoadRemoveAssignedPair loadRemoveAssignedPair ;
    public enum LoadRemoveAssignedPair{
        YES,NO
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "SUITABLE_PAIR_SUBSTITUTE",length = 20)
    private SuitablePairSubstitute  suitablePairSubstitute;
    public enum SuitablePairSubstitute
    {
        YES,NO;
    }

    @Column(name = "SMART_CHART2", length = 200)
    private  String smartChat2;

    @Column(name = "SPLICE_TYPE")
    private  Boolean spliceType;

    @Column(name = "FIRST_MILE1", length = 200)
    private  String firstMile1;

    @Column(name = "SERVICE_TERMINAL_ADDRESS", length = 200)
    private String serviceTerminalAddress;


    @Column(name = "CABLE_ID", length = 200)
    private String cableId;

    @Column(name = "STARTING_PAIR", length = 200)
    private String  startingPair;

    @Column(name = "ENDING_PAIR", length = 200)
    private String  endingPair;

    @Column(name = "COMMENT1", length = 2000)
    private String comment1;

    @Column(name = "DISPATCHED_BAN1", length = 200)
    private String dispatchedBAN1;



    @Column(name = "SERVING_TERMINAL_ADDRESS", length = 200)
    private String servingTerminalAddress;

    @Column(name = "CUSTOMER_UNIT_ADDRESS", length = 200)
    private String customerUnitAddress;

    @Enumerated(EnumType.STRING)
    @Column(name = "CABLE_TYPE", length = 50)
    private CableType cableType;

    public enum CableType{
        FEEDER_INTO_INTERFACE,DISTRIBUTION_FROM_INTERFACE
    }
    @Column(name = "INTERFACE_BOX_ADDRESS", length = 200)
    private String interfaceBoxAddress;

    @Column(name = "FIRST_MILE2", length = 200)
    private  String firstMile2;

    @Column(name = "ASSIGNED_BINDING_POST", length = 200)
    private String assignedBindingPost;

    @Column(name = "ACTUAL_BINDING_POST", length = 200)
    private String actualBindingPost;

    @Column(name = "VS_ADDRESS", length = 200)
    private String  vsAddress;

    @Column(name = "DISPATCHED_BAN2", length = 200)
    private String dispatchedBAN2;

    @Column(name = "CABLE_ID_RANGE", length = 200)
    private String cableIdRange;

    @Enumerated(EnumType.STRING)
    @Column(name = "REFERRAL_ASSOCIATION_INVESTIGATION", length = 20)
    private ReferralAssociateInvestigation  referralAssociateInvestigation;
    public enum  ReferralAssociateInvestigation{
        YES,NO
    }

    @Column(name = "ACKNOWLEDGE_REQUEST", length = 200)
    private String acknowledgeRequest;

    @Column(name = "COMMENT2", length = 2000)
    private String comment2;

    @Column(name = "COMPLETE_REQUEST", length = 200)
    private String completeRequest;

    @Column(name = "COMPLETE_DETAIL", length = 200)
    private String completeDetail;


}
