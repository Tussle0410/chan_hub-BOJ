export interface ServerInfo {
  solvedProblemCount: number;
}

export interface Problem {
  problemId: string;
  title: string;
  blogUrl: string;
  tags: string;
  javaCode: string;
}

export interface IndexProps {
  errorCode: any;
  serverInfo: ServerInfo;
}

export interface SolvedProps {
  errorCode: any;
  problem: Problem;
}

export interface ProblemComponentProps {
  problem: Problem;
}

export interface ServerInfoComponentProps {
  serverInfo: ServerInfo;
}
