import { Problem } from "../interfaces/server_types";

async function FindProblemInfo(problemId: string) {
  const response = await fetch(`http://localhost:8080/v1/chan_hub/api/problem/${problemId}`);
  const error_code = response.ok ? false : response.status;
  const json = await response.json();
  return {
    error_code,
    json,
  };
}

export async function getServerSideProps(context: any) {
  const { problemId } = context.query;
  const response = await FindProblemInfo(problemId);
  const problem: Problem = response.json;
  const errorCode = response.error_code;

  return {
    props: {
      problem,
      errorCode,
    },
  };
}
