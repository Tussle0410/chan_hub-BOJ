import React, { useState } from "react";
import AceEditor from "react-ace";
import styles from "@/styles/Home.module.css";
import { ProblemComponentProps } from "../interfaces/server_types";

import "ace-builds/src-noconflict/mode-java";
import "ace-builds/src-noconflict/mode-json";
import "ace-builds/src-noconflict/theme-github_dark";

const CodeEditor = (probs: ProblemComponentProps) => {
  const [code, setCode] = useState("// Start typing your code here...");

  const handleCodeChange = (newCode: string) => {
    setCode(newCode);
  };

  return (
    <div className={styles.input}>
      <AceEditor
        mode="java"
        theme="github_dark"
        name="code-editor"
        onChange={handleCodeChange}
        value={probs.problem.javaCode}
        fontSize={14}
        width="100%"
        height="500px"
        readOnly={true}
      />
    </div>
  );
};

export default CodeEditor;
