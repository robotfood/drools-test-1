package ca.cn.ems.hptaauditconfiguration;

public class AuditDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("input_TrainDirection")
	private java.lang.String inputTrainDirection;

	@org.kie.api.definition.type.Label("input_MilePointRange")
	private java.lang.Double inputMilePointRange;

	@org.kie.api.definition.type.Label("output_MinimumNonComplianceSpeed")
	private Double outputMinimumNonComplianceSpeed;

	@org.kie.api.definition.type.Label("input_TrainType")
	private java.lang.String inputTrainType;

	@org.kie.api.definition.type.Label("input_TrainSeries")
	private java.lang.Integer inputTrainSeries;

	@org.kie.api.definition.type.Label("input_Region")
	private java.lang.String inputRegion;

	@org.kie.api.definition.type.Label("input_Division")
	private java.lang.String inputDivision;

	@org.kie.api.definition.type.Label("input_Zone")
	private java.lang.String inputZone;

	@org.kie.api.definition.type.Label("input_SubDivision")
	private java.lang.String inputSubDivision;

	@org.kie.api.definition.type.Label("input_ActualHpt")
	private java.lang.Integer inputActualHpt;

	@org.kie.api.definition.type.Label("input_ResultingHpt")
	private java.lang.Double inputResultingHpt;

	@org.kie.api.definition.type.Label("input_DesignHpt")
	private java.lang.Double inputDesignHpt;

	@org.kie.api.definition.type.Label("input_TrainConsistType")
	private String inputTrainConsistType;

	@org.kie.api.definition.type.Label("input_TrainPowerType")
	private java.lang.String inputTrainPowerType;

	@org.kie.api.definition.type.Label("input_GeoFence")
	private Integer inputGeoFence;

	@org.kie.api.definition.type.Label("output_AuditArrivalTimeLimit")
	private java.lang.Integer outputAuditArrivalTimeLimit;

	@org.kie.api.definition.type.Label("output_HPAllowanceBuffer ")
	private java.lang.Integer outputHPAllowanceBuffer;

	@org.kie.api.definition.type.Label("output_LocomotiveDataIntervalNonCompliance")
	private java.lang.Integer outputLocomotiveDataIntervalNonCompliance;

	@org.kie.api.definition.type.Label("output_ThrottleNotchConsecutiveComplianceLimit")
	private java.lang.Integer outputThrottleNotchConsecutiveComplianceLimit;

	@org.kie.api.definition.type.Label("output_ThrottleNotchCumulativeComplianceLimit")
	private java.lang.Integer outputThrottleNotchCumulativeComplianceLimit;

	@org.kie.api.definition.type.Label("output_PowerModeCumulativeComplianceLimit")
	private java.lang.Integer outputPowerModeCumulativeComplianceLimit;

	@org.kie.api.definition.type.Label("output_PowerModeConsecutiveComplianceLimit")
	private java.lang.Integer outputPowerModeConsecutiveComplianceLimit;

	@org.kie.api.definition.type.Label("output_MissingInformationCumulativeLimit")
	private java.lang.Integer outputMissingInformationCumulativeLimit;

	@org.kie.api.definition.type.Label("input_TrainId")
	private java.lang.String inputTrainId;

	@org.kie.api.definition.type.Label("output_AuditInterval")
	private java.lang.Integer outputAuditInterval;

	@org.kie.api.definition.type.Label("output_BusinessRulesApplied")
	private java.util.List<java.lang.String> outputBusinessRulesApplied;

	@org.kie.api.definition.type.Label("input_LocomotiveModel")
	private java.util.List<java.lang.String> inputLocomotiveModel;

	@org.kie.api.definition.type.Label("output_PassingStationLimit")
	private java.lang.Integer outputPassingStationLimit;

	@org.kie.api.definition.type.Label("output_FlexibleNonCompliantCumulativeThreshold")
	private java.lang.Integer outputFlexibleNonCompliantCumulativeThreshold;

	@org.kie.api.definition.type.Label("output_FlexibleNonCompliantConsecutiveThreshold")
	private java.lang.Integer outputFlexibleNonCompliantConsecutiveThreshold;

	@org.kie.api.definition.type.Label("output_MinimumThresholdHPT")
	private java.lang.Double outputMinimumThresholdHPT;

	@org.kie.api.definition.type.Label("output_InUnlimitedZone")
	private boolean outputInUnlimitedZone;

	@org.kie.api.definition.type.Label("input_UnlimitedZoneDataList")
	private java.util.List<ca.cn.ems.hptaauditconfiguration.UnlimitedZoneData> inputUnlimitedZoneDataList;

	@org.kie.api.definition.type.Label("output_ZoneRestrictionType")
	private java.lang.String outputZoneRestrictionType;

	@org.kie.api.definition.type.Label("output_MaximumMinutesOfTrainInYardStatus")
	private java.lang.Integer outputMaximumMinutesOfTrainInYardStatus;

	@org.kie.api.definition.type.Label(value = "test")
	private java.lang.Float test;

	public AuditDetails() {
	}

	public java.lang.String getInputTrainDirection() {
		return this.inputTrainDirection;
	}

	public void setInputTrainDirection(java.lang.String inputTrainDirection) {
		this.inputTrainDirection = inputTrainDirection;
	}

	public java.lang.Double getInputMilePointRange() {
		return this.inputMilePointRange;
	}

	public void setInputMilePointRange(java.lang.Double inputMilePointRange) {
		this.inputMilePointRange = inputMilePointRange;
	}

	public java.lang.String getInputTrainType() {
		return this.inputTrainType;
	}

	public void setInputTrainType(java.lang.String inputTrainType) {
		this.inputTrainType = inputTrainType;
	}

	public java.lang.Integer getInputTrainSeries() {
		return this.inputTrainSeries;
	}

	public void setInputTrainSeries(java.lang.Integer inputTrainSeries) {
		this.inputTrainSeries = inputTrainSeries;
	}

	public java.lang.String getInputRegion() {
		return this.inputRegion;
	}

	public void setInputRegion(java.lang.String inputRegion) {
		this.inputRegion = inputRegion;
	}

	public java.lang.String getInputDivision() {
		return this.inputDivision;
	}

	public void setInputDivision(java.lang.String inputDivision) {
		this.inputDivision = inputDivision;
	}

	public java.lang.String getInputZone() {
		return this.inputZone;
	}

	public void setInputZone(java.lang.String inputZone) {
		this.inputZone = inputZone;
	}

	public java.lang.String getInputSubDivision() {
		return this.inputSubDivision;
	}

	public void setInputSubDivision(java.lang.String inputSubDivision) {
		this.inputSubDivision = inputSubDivision;
	}

	public java.lang.Integer getInputActualHpt() {
		return this.inputActualHpt;
	}

	public void setInputActualHpt(java.lang.Integer inputActualHpt) {
		this.inputActualHpt = inputActualHpt;
	}

	public java.lang.Double getInputResultingHpt() {
		return this.inputResultingHpt;
	}

	public void setInputResultingHpt(java.lang.Double inputResultingHpt) {
		this.inputResultingHpt = inputResultingHpt;
	}

	public java.lang.Double getInputDesignHpt() {
		return this.inputDesignHpt;
	}

	public void setInputDesignHpt(java.lang.Double inputDesignHpt) {
		this.inputDesignHpt = inputDesignHpt;
	}

	public java.lang.String getInputTrainPowerType() {
		return this.inputTrainPowerType;
	}

	public void setInputTrainPowerType(java.lang.String inputTrainPowerType) {
		this.inputTrainPowerType = inputTrainPowerType;
	}

	public java.lang.Integer getOutputAuditArrivalTimeLimit() {
		return this.outputAuditArrivalTimeLimit;
	}

	public void setOutputAuditArrivalTimeLimit(
			java.lang.Integer outputAuditArrivalTimeLimit) {
		this.outputAuditArrivalTimeLimit = outputAuditArrivalTimeLimit;
	}

	public java.lang.Integer getOutputHPAllowanceBuffer() {
		return this.outputHPAllowanceBuffer;
	}

	public void setOutputHPAllowanceBuffer(
			java.lang.Integer outputHPAllowanceBuffer) {
		this.outputHPAllowanceBuffer = outputHPAllowanceBuffer;
	}

	public java.lang.Integer getOutputLocomotiveDataIntervalNonCompliance() {
		return this.outputLocomotiveDataIntervalNonCompliance;
	}

	public void setOutputLocomotiveDataIntervalNonCompliance(
			java.lang.Integer outputLocomotiveDataIntervalNonCompliance) {
		this.outputLocomotiveDataIntervalNonCompliance = outputLocomotiveDataIntervalNonCompliance;
	}

	public java.lang.Integer getOutputThrottleNotchConsecutiveComplianceLimit() {
		return this.outputThrottleNotchConsecutiveComplianceLimit;
	}

	public void setOutputThrottleNotchConsecutiveComplianceLimit(
			java.lang.Integer outputThrottleNotchConsecutiveComplianceLimit) {
		this.outputThrottleNotchConsecutiveComplianceLimit = outputThrottleNotchConsecutiveComplianceLimit;
	}

	public java.lang.Integer getOutputThrottleNotchCumulativeComplianceLimit() {
		return this.outputThrottleNotchCumulativeComplianceLimit;
	}

	public void setOutputThrottleNotchCumulativeComplianceLimit(
			java.lang.Integer outputThrottleNotchCumulativeComplianceLimit) {
		this.outputThrottleNotchCumulativeComplianceLimit = outputThrottleNotchCumulativeComplianceLimit;
	}

	public java.lang.Integer getOutputPowerModeCumulativeComplianceLimit() {
		return this.outputPowerModeCumulativeComplianceLimit;
	}

	public void setOutputPowerModeCumulativeComplianceLimit(
			java.lang.Integer outputPowerModeCumulativeComplianceLimit) {
		this.outputPowerModeCumulativeComplianceLimit = outputPowerModeCumulativeComplianceLimit;
	}

	public java.lang.Integer getOutputPowerModeConsecutiveComplianceLimit() {
		return this.outputPowerModeConsecutiveComplianceLimit;
	}

	public void setOutputPowerModeConsecutiveComplianceLimit(
			java.lang.Integer outputPowerModeConsecutiveComplianceLimit) {
		this.outputPowerModeConsecutiveComplianceLimit = outputPowerModeConsecutiveComplianceLimit;
	}

	public java.lang.Integer getOutputMissingInformationCumulativeLimit() {
		return this.outputMissingInformationCumulativeLimit;
	}

	public void setOutputMissingInformationCumulativeLimit(
			java.lang.Integer outputMissingInformationCumulativeLimit) {
		this.outputMissingInformationCumulativeLimit = outputMissingInformationCumulativeLimit;
	}

	public java.lang.String getInputTrainId() {
		return this.inputTrainId;
	}

	public void setInputTrainId(java.lang.String inputTrainId) {
		this.inputTrainId = inputTrainId;
	}

	public java.lang.Integer getOutputAuditInterval() {
		return this.outputAuditInterval;
	}

	public void setOutputAuditInterval(java.lang.Integer outputAuditInterval) {
		this.outputAuditInterval = outputAuditInterval;
	}

	public java.util.List<java.lang.String> getOutputBusinessRulesApplied() {
		return this.outputBusinessRulesApplied;
	}

	public void setOutputBusinessRulesApplied(
			java.util.List<java.lang.String> outputBusinessRulesApplied) {
		this.outputBusinessRulesApplied = outputBusinessRulesApplied;
	}

	public java.lang.String getInputTrainConsistType() {
		return this.inputTrainConsistType;
	}

	public void setInputTrainConsistType(java.lang.String inputTrainConsistType) {
		this.inputTrainConsistType = inputTrainConsistType;
	}

	public java.util.List<java.lang.String> getInputLocomotiveModel() {
		return this.inputLocomotiveModel;
	}

	public void setInputLocomotiveModel(
			java.util.List<java.lang.String> inputLocomotiveModel) {
		this.inputLocomotiveModel = inputLocomotiveModel;
	}

	public java.lang.Integer getInputGeoFence() {
		return this.inputGeoFence;
	}

	public void setInputGeoFence(java.lang.Integer inputGeoFence) {
		this.inputGeoFence = inputGeoFence;
	}

	public java.lang.Integer getOutputPassingStationLimit() {
		return this.outputPassingStationLimit;
	}

	public void setOutputPassingStationLimit(
			java.lang.Integer outputPassingStationLimit) {
		this.outputPassingStationLimit = outputPassingStationLimit;
	}

	public java.lang.Integer getOutputFlexibleNonCompliantCumulativeThreshold() {
		return this.outputFlexibleNonCompliantCumulativeThreshold;
	}

	public void setOutputFlexibleNonCompliantCumulativeThreshold(
			java.lang.Integer outputFlexibleNonCompliantCumulativeThreshold) {
		this.outputFlexibleNonCompliantCumulativeThreshold = outputFlexibleNonCompliantCumulativeThreshold;
	}

	public java.lang.Integer getOutputFlexibleNonCompliantConsecutiveThreshold() {
		return this.outputFlexibleNonCompliantConsecutiveThreshold;
	}

	public void setOutputFlexibleNonCompliantConsecutiveThreshold(
			java.lang.Integer outputFlexibleNonCompliantConsecutiveThreshold) {
		this.outputFlexibleNonCompliantConsecutiveThreshold = outputFlexibleNonCompliantConsecutiveThreshold;
	}

	public java.lang.Double getOutputMinimumThresholdHPT() {
		return this.outputMinimumThresholdHPT;
	}

	public void setOutputMinimumThresholdHPT(
			java.lang.Double outputMinimumThresholdHPT) {
		this.outputMinimumThresholdHPT = outputMinimumThresholdHPT;
	}

	public boolean isOutputInUnlimitedZone() {
		return this.outputInUnlimitedZone;
	}

	public void setOutputInUnlimitedZone(boolean outputInUnlimitedZone) {
		this.outputInUnlimitedZone = outputInUnlimitedZone;
	}

	public java.util.List<ca.cn.ems.hptaauditconfiguration.UnlimitedZoneData> getInputUnlimitedZoneDataList() {
		return this.inputUnlimitedZoneDataList;
	}

	public void setInputUnlimitedZoneDataList(
			java.util.List<ca.cn.ems.hptaauditconfiguration.UnlimitedZoneData> inputUnlimitedZoneDataList) {
		this.inputUnlimitedZoneDataList = inputUnlimitedZoneDataList;
	}

	public java.lang.String getOutputZoneRestrictionType() {
		return this.outputZoneRestrictionType;
	}

	public void setOutputZoneRestrictionType(
			java.lang.String outputZoneRestrictionType) {
		this.outputZoneRestrictionType = outputZoneRestrictionType;
	}

	public java.lang.Double getOutputMinimumNonComplianceSpeed() {
		return this.outputMinimumNonComplianceSpeed;
	}

	public void setOutputMinimumNonComplianceSpeed(
			java.lang.Double outputMinimumNonComplianceSpeed) {
		this.outputMinimumNonComplianceSpeed = outputMinimumNonComplianceSpeed;
	}

	public java.lang.Integer getOutputMaximumMinutesOfTrainInYardStatus() {
		return this.outputMaximumMinutesOfTrainInYardStatus;
	}

	public void setOutputMaximumMinutesOfTrainInYardStatus(
			java.lang.Integer outputMaximumMinutesOfTrainInYardStatus) {
		this.outputMaximumMinutesOfTrainInYardStatus = outputMaximumMinutesOfTrainInYardStatus;
	}

	public java.lang.Float getTest() {
		return this.test;
	}

	public void setTest(java.lang.Float test) {
		this.test = test;
	}

	public AuditDetails(
			java.lang.String inputTrainDirection,
			java.lang.Double inputMilePointRange,
			java.lang.Double outputMinimumNonComplianceSpeed,
			java.lang.String inputTrainType,
			java.lang.Integer inputTrainSeries,
			java.lang.String inputRegion,
			java.lang.String inputDivision,
			java.lang.String inputZone,
			java.lang.String inputSubDivision,
			java.lang.Integer inputActualHpt,
			java.lang.Double inputResultingHpt,
			java.lang.Double inputDesignHpt,
			java.lang.String inputTrainConsistType,
			java.lang.String inputTrainPowerType,
			java.lang.Integer inputGeoFence,
			java.lang.Integer outputAuditArrivalTimeLimit,
			java.lang.Integer outputHPAllowanceBuffer,
			java.lang.Integer outputLocomotiveDataIntervalNonCompliance,
			java.lang.Integer outputThrottleNotchConsecutiveComplianceLimit,
			java.lang.Integer outputThrottleNotchCumulativeComplianceLimit,
			java.lang.Integer outputPowerModeCumulativeComplianceLimit,
			java.lang.Integer outputPowerModeConsecutiveComplianceLimit,
			java.lang.Integer outputMissingInformationCumulativeLimit,
			java.lang.String inputTrainId,
			java.lang.Integer outputAuditInterval,
			java.util.List<java.lang.String> outputBusinessRulesApplied,
			java.util.List<java.lang.String> inputLocomotiveModel,
			java.lang.Integer outputPassingStationLimit,
			java.lang.Integer outputFlexibleNonCompliantCumulativeThreshold,
			java.lang.Integer outputFlexibleNonCompliantConsecutiveThreshold,
			java.lang.Double outputMinimumThresholdHPT,
			boolean outputInUnlimitedZone,
			java.util.List<ca.cn.ems.hptaauditconfiguration.UnlimitedZoneData> inputUnlimitedZoneDataList,
			java.lang.String outputZoneRestrictionType,
			java.lang.Integer outputMaximumMinutesOfTrainInYardStatus,
			java.lang.Float test) {
		this.inputTrainDirection = inputTrainDirection;
		this.inputMilePointRange = inputMilePointRange;
		this.outputMinimumNonComplianceSpeed = outputMinimumNonComplianceSpeed;
		this.inputTrainType = inputTrainType;
		this.inputTrainSeries = inputTrainSeries;
		this.inputRegion = inputRegion;
		this.inputDivision = inputDivision;
		this.inputZone = inputZone;
		this.inputSubDivision = inputSubDivision;
		this.inputActualHpt = inputActualHpt;
		this.inputResultingHpt = inputResultingHpt;
		this.inputDesignHpt = inputDesignHpt;
		this.inputTrainConsistType = inputTrainConsistType;
		this.inputTrainPowerType = inputTrainPowerType;
		this.inputGeoFence = inputGeoFence;
		this.outputAuditArrivalTimeLimit = outputAuditArrivalTimeLimit;
		this.outputHPAllowanceBuffer = outputHPAllowanceBuffer;
		this.outputLocomotiveDataIntervalNonCompliance = outputLocomotiveDataIntervalNonCompliance;
		this.outputThrottleNotchConsecutiveComplianceLimit = outputThrottleNotchConsecutiveComplianceLimit;
		this.outputThrottleNotchCumulativeComplianceLimit = outputThrottleNotchCumulativeComplianceLimit;
		this.outputPowerModeCumulativeComplianceLimit = outputPowerModeCumulativeComplianceLimit;
		this.outputPowerModeConsecutiveComplianceLimit = outputPowerModeConsecutiveComplianceLimit;
		this.outputMissingInformationCumulativeLimit = outputMissingInformationCumulativeLimit;
		this.inputTrainId = inputTrainId;
		this.outputAuditInterval = outputAuditInterval;
		this.outputBusinessRulesApplied = outputBusinessRulesApplied;
		this.inputLocomotiveModel = inputLocomotiveModel;
		this.outputPassingStationLimit = outputPassingStationLimit;
		this.outputFlexibleNonCompliantCumulativeThreshold = outputFlexibleNonCompliantCumulativeThreshold;
		this.outputFlexibleNonCompliantConsecutiveThreshold = outputFlexibleNonCompliantConsecutiveThreshold;
		this.outputMinimumThresholdHPT = outputMinimumThresholdHPT;
		this.outputInUnlimitedZone = outputInUnlimitedZone;
		this.inputUnlimitedZoneDataList = inputUnlimitedZoneDataList;
		this.outputZoneRestrictionType = outputZoneRestrictionType;
		this.outputMaximumMinutesOfTrainInYardStatus = outputMaximumMinutesOfTrainInYardStatus;
		this.test = test;
	}

}