package org.hl7.fhir.r4.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sat, Feb 9, 2019 15:11-0500 for FHIR v4.0.0


import org.hl7.fhir.exceptions.FHIRException;

public enum StudyType {

        /**
         * randomized controlled trial.
         */
        RCT, 
        /**
         * controlled (but not randomized) trial.
         */
        CCT, 
        /**
         * observational study comparing cohorts.
         */
        COHORT, 
        /**
         * case-control study.
         */
        CASECONTROL, 
        /**
         * uncontrolled cohort or case series.
         */
        SERIES, 
        /**
         * a single case report.
         */
        CASEREPORT, 
        /**
         * a combination of 1 or more types of studies.
         */
        MIXED, 
        /**
         * added to help the parsers
         */
        NULL;
        public static StudyType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("RCT".equals(codeString))
          return RCT;
        if ("CCT".equals(codeString))
          return CCT;
        if ("cohort".equals(codeString))
          return COHORT;
        if ("case-control".equals(codeString))
          return CASECONTROL;
        if ("series".equals(codeString))
          return SERIES;
        if ("case-report".equals(codeString))
          return CASEREPORT;
        if ("mixed".equals(codeString))
          return MIXED;
        throw new FHIRException("Unknown StudyType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case RCT: return "RCT";
            case CCT: return "CCT";
            case COHORT: return "cohort";
            case CASECONTROL: return "case-control";
            case SERIES: return "series";
            case CASEREPORT: return "case-report";
            case MIXED: return "mixed";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://terminology.hl7.org/CodeSystem/study-type";
        }
        public String getDefinition() {
          switch (this) {
            case RCT: return "randomized controlled trial.";
            case CCT: return "controlled (but not randomized) trial.";
            case COHORT: return "observational study comparing cohorts.";
            case CASECONTROL: return "case-control study.";
            case SERIES: return "uncontrolled cohort or case series.";
            case CASEREPORT: return "a single case report.";
            case MIXED: return "a combination of 1 or more types of studies.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case RCT: return "randomized trial";
            case CCT: return "controlled trial (non-randomized)";
            case COHORT: return "comparative cohort study";
            case CASECONTROL: return "case-control study";
            case SERIES: return "uncontrolled cohort or case series";
            case CASEREPORT: return "case report";
            case MIXED: return "mixed methods";
            default: return "?";
          }
    }


}

