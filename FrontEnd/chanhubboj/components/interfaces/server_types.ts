export interface ServerInfo {
  solvedProblemCount: number;
}

export interface Problem {
  title: string;
  blogUrl: string;
  tags: string;
  javaCode: string;
}

export interface ProblemComponentProps {
  problem: Problem;
}

export interface ServerInfoComponentProps {
  serverInfo: ServerInfo;
}
